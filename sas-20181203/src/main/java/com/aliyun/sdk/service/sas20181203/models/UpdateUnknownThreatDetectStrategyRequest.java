// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateUnknownThreatDetectStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateUnknownThreatDetectStrategyRequest</p>
 */
public class UpdateUnknownThreatDetectStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationDaysAfterInit")
    private Integer durationDaysAfterInit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationDaysAfterStop")
    private Integer durationDaysAfterStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudyMode")
    private String studyMode;

    private UpdateUnknownThreatDetectStrategyRequest(Builder builder) {
        super(builder);
        this.durationDaysAfterInit = builder.durationDaysAfterInit;
        this.durationDaysAfterStop = builder.durationDaysAfterStop;
        this.id = builder.id;
        this.name = builder.name;
        this.studyMode = builder.studyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUnknownThreatDetectStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return durationDaysAfterInit
     */
    public Integer getDurationDaysAfterInit() {
        return this.durationDaysAfterInit;
    }

    /**
     * @return durationDaysAfterStop
     */
    public Integer getDurationDaysAfterStop() {
        return this.durationDaysAfterStop;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return studyMode
     */
    public String getStudyMode() {
        return this.studyMode;
    }

    public static final class Builder extends Request.Builder<UpdateUnknownThreatDetectStrategyRequest, Builder> {
        private Integer durationDaysAfterInit; 
        private Integer durationDaysAfterStop; 
        private String id; 
        private String name; 
        private String studyMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUnknownThreatDetectStrategyRequest request) {
            super(request);
            this.durationDaysAfterInit = request.durationDaysAfterInit;
            this.durationDaysAfterStop = request.durationDaysAfterStop;
            this.id = request.id;
            this.name = request.name;
            this.studyMode = request.studyMode;
        } 

        /**
         * DurationDaysAfterInit.
         */
        public Builder durationDaysAfterInit(Integer durationDaysAfterInit) {
            this.putQueryParameter("DurationDaysAfterInit", durationDaysAfterInit);
            this.durationDaysAfterInit = durationDaysAfterInit;
            return this;
        }

        /**
         * DurationDaysAfterStop.
         */
        public Builder durationDaysAfterStop(Integer durationDaysAfterStop) {
            this.putQueryParameter("DurationDaysAfterStop", durationDaysAfterStop);
            this.durationDaysAfterStop = durationDaysAfterStop;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * StudyMode.
         */
        public Builder studyMode(String studyMode) {
            this.putQueryParameter("StudyMode", studyMode);
            this.studyMode = studyMode;
            return this;
        }

        @Override
        public UpdateUnknownThreatDetectStrategyRequest build() {
            return new UpdateUnknownThreatDetectStrategyRequest(this);
        } 

    } 

}

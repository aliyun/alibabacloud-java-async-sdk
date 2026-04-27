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
 * {@link CreateUnknownThreatDetectStrategyRequest} extends {@link RequestModel}
 *
 * <p>CreateUnknownThreatDetectStrategyRequest</p>
 */
public class CreateUnknownThreatDetectStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetSelectionType")
    private String assetSelectionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationDaysAfterInit")
    private Integer durationDaysAfterInit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationDaysAfterStop")
    private Integer durationDaysAfterStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudyMode")
    private String studyMode;

    private CreateUnknownThreatDetectStrategyRequest(Builder builder) {
        super(builder);
        this.assetSelectionType = builder.assetSelectionType;
        this.durationDaysAfterInit = builder.durationDaysAfterInit;
        this.durationDaysAfterStop = builder.durationDaysAfterStop;
        this.name = builder.name;
        this.studyMode = builder.studyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUnknownThreatDetectStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetSelectionType
     */
    public String getAssetSelectionType() {
        return this.assetSelectionType;
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

    public static final class Builder extends Request.Builder<CreateUnknownThreatDetectStrategyRequest, Builder> {
        private String assetSelectionType; 
        private Integer durationDaysAfterInit; 
        private Integer durationDaysAfterStop; 
        private String name; 
        private String studyMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateUnknownThreatDetectStrategyRequest request) {
            super(request);
            this.assetSelectionType = request.assetSelectionType;
            this.durationDaysAfterInit = request.durationDaysAfterInit;
            this.durationDaysAfterStop = request.durationDaysAfterStop;
            this.name = request.name;
            this.studyMode = request.studyMode;
        } 

        /**
         * AssetSelectionType.
         */
        public Builder assetSelectionType(String assetSelectionType) {
            this.putQueryParameter("AssetSelectionType", assetSelectionType);
            this.assetSelectionType = assetSelectionType;
            return this;
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
        public CreateUnknownThreatDetectStrategyRequest build() {
            return new CreateUnknownThreatDetectStrategyRequest(this);
        } 

    } 

}

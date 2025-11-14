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
 * {@link HandleSimilarMaliciousFilesRequest} extends {@link RequestModel}
 *
 * <p>HandleSimilarMaliciousFilesRequest</p>
 */
public class HandleSimilarMaliciousFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private String scanRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenario")
    private String scenario;

    private HandleSimilarMaliciousFilesRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.lang = builder.lang;
        this.operation = builder.operation;
        this.scanRange = builder.scanRange;
        this.scenario = builder.scenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleSimilarMaliciousFilesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return scanRange
     */
    public String getScanRange() {
        return this.scanRange;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    public static final class Builder extends Request.Builder<HandleSimilarMaliciousFilesRequest, Builder> {
        private Long eventId; 
        private String lang; 
        private String operation; 
        private String scanRange; 
        private String scenario; 

        private Builder() {
            super();
        } 

        private Builder(HandleSimilarMaliciousFilesRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.lang = request.lang;
            this.operation = request.operation;
            this.scanRange = request.scanRange;
            this.scenario = request.scenario;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * ScanRange.
         */
        public Builder scanRange(String scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * Scenario.
         */
        public Builder scenario(String scenario) {
            this.putQueryParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        @Override
        public HandleSimilarMaliciousFilesRequest build() {
            return new HandleSimilarMaliciousFilesRequest(this);
        } 

    } 

}

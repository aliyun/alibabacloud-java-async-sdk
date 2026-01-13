// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetRecallManagementServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecallManagementServiceResponseBody</p>
 */
public class GetRecallManagementServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentRecallManagementServiceVersionId")
    private String currentRecallManagementServiceVersionId;

    @com.aliyun.core.annotation.NameInMap("CurrentRecallManagementServiceVersionName")
    private String currentRecallManagementServiceVersionName;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceId")
    private String recallManagementServiceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetRecallManagementServiceResponseBody(Builder builder) {
        this.currentRecallManagementServiceVersionId = builder.currentRecallManagementServiceVersionId;
        this.currentRecallManagementServiceVersionName = builder.currentRecallManagementServiceVersionName;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.name = builder.name;
        this.recallManagementServiceId = builder.recallManagementServiceId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecallManagementServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentRecallManagementServiceVersionId
     */
    public String getCurrentRecallManagementServiceVersionId() {
        return this.currentRecallManagementServiceVersionId;
    }

    /**
     * @return currentRecallManagementServiceVersionName
     */
    public String getCurrentRecallManagementServiceVersionName() {
        return this.currentRecallManagementServiceVersionName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recallManagementServiceId
     */
    public String getRecallManagementServiceId() {
        return this.recallManagementServiceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String currentRecallManagementServiceVersionId; 
        private String currentRecallManagementServiceVersionName; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String name; 
        private String recallManagementServiceId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetRecallManagementServiceResponseBody model) {
            this.currentRecallManagementServiceVersionId = model.currentRecallManagementServiceVersionId;
            this.currentRecallManagementServiceVersionName = model.currentRecallManagementServiceVersionName;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.name = model.name;
            this.recallManagementServiceId = model.recallManagementServiceId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * CurrentRecallManagementServiceVersionId.
         */
        public Builder currentRecallManagementServiceVersionId(String currentRecallManagementServiceVersionId) {
            this.currentRecallManagementServiceVersionId = currentRecallManagementServiceVersionId;
            return this;
        }

        /**
         * CurrentRecallManagementServiceVersionName.
         */
        public Builder currentRecallManagementServiceVersionName(String currentRecallManagementServiceVersionName) {
            this.currentRecallManagementServiceVersionName = currentRecallManagementServiceVersionName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RecallManagementServiceId.
         */
        public Builder recallManagementServiceId(String recallManagementServiceId) {
            this.recallManagementServiceId = recallManagementServiceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetRecallManagementServiceResponseBody build() {
            return new GetRecallManagementServiceResponseBody(this);
        } 

    } 

}

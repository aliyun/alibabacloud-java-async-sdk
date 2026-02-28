// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link BatchDeleteDeviceGroupRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDeleteDeviceGroupRelationsResponseBody</p>
 */
public class BatchDeleteDeviceGroupRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlreadyRelatedGroupDeviceCount")
    private Integer alreadyRelatedGroupDeviceCount;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("SuccessDeviceCount")
    private Integer successDeviceCount;

    @com.aliyun.core.annotation.NameInMap("ValidDeviceCount")
    private Integer validDeviceCount;

    private BatchDeleteDeviceGroupRelationsResponseBody(Builder builder) {
        this.alreadyRelatedGroupDeviceCount = builder.alreadyRelatedGroupDeviceCount;
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.successDeviceCount = builder.successDeviceCount;
        this.validDeviceCount = builder.validDeviceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteDeviceGroupRelationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alreadyRelatedGroupDeviceCount
     */
    public Integer getAlreadyRelatedGroupDeviceCount() {
        return this.alreadyRelatedGroupDeviceCount;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return successDeviceCount
     */
    public Integer getSuccessDeviceCount() {
        return this.successDeviceCount;
    }

    /**
     * @return validDeviceCount
     */
    public Integer getValidDeviceCount() {
        return this.validDeviceCount;
    }

    public static final class Builder {
        private Integer alreadyRelatedGroupDeviceCount; 
        private String code; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Integer successDeviceCount; 
        private Integer validDeviceCount; 

        private Builder() {
        } 

        private Builder(BatchDeleteDeviceGroupRelationsResponseBody model) {
            this.alreadyRelatedGroupDeviceCount = model.alreadyRelatedGroupDeviceCount;
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.successDeviceCount = model.successDeviceCount;
            this.validDeviceCount = model.validDeviceCount;
        } 

        /**
         * <p>The number of devices that exist in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder alreadyRelatedGroupDeviceCount(Integer alreadyRelatedGroupDeviceCount) {
            this.alreadyRelatedGroupDeviceCount = alreadyRelatedGroupDeviceCount;
            return this;
        }

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8739385E-143F-4389-B900-B7DF9174CE0D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The number of devices that are removed from the group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder successDeviceCount(Integer successDeviceCount) {
            this.successDeviceCount = successDeviceCount;
            return this;
        }

        /**
         * <p>The number of valid devices that you specified.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder validDeviceCount(Integer validDeviceCount) {
            this.validDeviceCount = validDeviceCount;
            return this;
        }

        public BatchDeleteDeviceGroupRelationsResponseBody build() {
            return new BatchDeleteDeviceGroupRelationsResponseBody(this);
        } 

    } 

}

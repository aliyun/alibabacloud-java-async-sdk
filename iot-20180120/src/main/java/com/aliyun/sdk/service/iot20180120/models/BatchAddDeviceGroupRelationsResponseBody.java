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
 * {@link BatchAddDeviceGroupRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchAddDeviceGroupRelationsResponseBody</p>
 */
public class BatchAddDeviceGroupRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlreadyRelatedGroupDeviceCount")
    private Integer alreadyRelatedGroupDeviceCount;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ExceedTenGroupDeviceCount")
    private Integer exceedTenGroupDeviceCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("SuccessAddedDeviceCount")
    private Integer successAddedDeviceCount;

    @com.aliyun.core.annotation.NameInMap("ValidDeviceCount")
    private Integer validDeviceCount;

    private BatchAddDeviceGroupRelationsResponseBody(Builder builder) {
        this.alreadyRelatedGroupDeviceCount = builder.alreadyRelatedGroupDeviceCount;
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.exceedTenGroupDeviceCount = builder.exceedTenGroupDeviceCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.successAddedDeviceCount = builder.successAddedDeviceCount;
        this.validDeviceCount = builder.validDeviceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddDeviceGroupRelationsResponseBody create() {
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
     * @return exceedTenGroupDeviceCount
     */
    public Integer getExceedTenGroupDeviceCount() {
        return this.exceedTenGroupDeviceCount;
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
     * @return successAddedDeviceCount
     */
    public Integer getSuccessAddedDeviceCount() {
        return this.successAddedDeviceCount;
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
        private Integer exceedTenGroupDeviceCount; 
        private String requestId; 
        private Boolean success; 
        private Integer successAddedDeviceCount; 
        private Integer validDeviceCount; 

        private Builder() {
        } 

        private Builder(BatchAddDeviceGroupRelationsResponseBody model) {
            this.alreadyRelatedGroupDeviceCount = model.alreadyRelatedGroupDeviceCount;
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.exceedTenGroupDeviceCount = model.exceedTenGroupDeviceCount;
            this.requestId = model.requestId;
            this.success = model.success;
            this.successAddedDeviceCount = model.successAddedDeviceCount;
            this.validDeviceCount = model.validDeviceCount;
        } 

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder alreadyRelatedGroupDeviceCount(Integer alreadyRelatedGroupDeviceCount) {
            this.alreadyRelatedGroupDeviceCount = alreadyRelatedGroupDeviceCount;
            return this;
        }

        /**
         * <p>The number of valid devices that you specified.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The number of devices that exist in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder exceedTenGroupDeviceCount(Integer exceedTenGroupDeviceCount) {
            this.exceedTenGroupDeviceCount = exceedTenGroupDeviceCount;
            return this;
        }

        /**
         * <p>The number of the specified devices that are added to 10 or more groups. You can add a device to a maximum of 10 groups.</p>
         * 
         * <strong>example:</strong>
         * <p>671D0F8F-FDC7-4B12-93FA-336C079C965A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * SuccessAddedDeviceCount.
         */
        public Builder successAddedDeviceCount(Integer successAddedDeviceCount) {
            this.successAddedDeviceCount = successAddedDeviceCount;
            return this;
        }

        /**
         * <p>The number of devices that are added to the group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder validDeviceCount(Integer validDeviceCount) {
            this.validDeviceCount = validDeviceCount;
            return this;
        }

        public BatchAddDeviceGroupRelationsResponseBody build() {
            return new BatchAddDeviceGroupRelationsResponseBody(this);
        } 

    } 

}

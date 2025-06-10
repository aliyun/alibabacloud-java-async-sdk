// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link CreateBuildRecordByRecordResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBuildRecordByRecordResponseBody</p>
 */
public class CreateBuildRecordByRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuildRecordId")
    private String buildRecordId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBuildRecordByRecordResponseBody(Builder builder) {
        this.buildRecordId = builder.buildRecordId;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBuildRecordByRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildRecordId
     */
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String buildRecordId; 
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateBuildRecordByRecordResponseBody model) {
            this.buildRecordId = model.buildRecordId;
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the image building record.</p>
         * 
         * <strong>example:</strong>
         * <p>crbr-ly77w5i3t31f****</p>
         */
        public Builder buildRecordId(String buildRecordId) {
            this.buildRecordId = buildRecordId;
            return this;
        }

        /**
         * <p>The HTTP status code. The status code 200 indicates that the request is successful.<br>Other status codes indicate that the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4CE1F661-75DD-4EBD-A4AD-057B26834ABB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBuildRecordByRecordResponseBody build() {
            return new CreateBuildRecordByRecordResponseBody(this);
        } 

    } 

}

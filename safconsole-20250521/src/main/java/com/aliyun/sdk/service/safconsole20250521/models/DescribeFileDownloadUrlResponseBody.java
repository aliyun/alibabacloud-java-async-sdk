// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeFileDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileDownloadUrlResponseBody</p>
 */
public class DescribeFileDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private String resultObject;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeFileDownloadUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileDownloadUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public String getResultObject() {
        return this.resultObject;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private String requestId; 
        private String resultObject; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeFileDownloadUrlResponseBody model) {
            this.code = model.code;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
        } 

        /**
         * <p>Status code. A return value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder resultObject(String resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: Call succeeded.</li>
         * <li><strong>false</strong>: Call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeFileDownloadUrlResponseBody build() {
            return new DescribeFileDownloadUrlResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetResourceQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceQuotaResponseBody</p>
 */
public class GetResourceQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Long data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetResourceQuotaResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Long data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetResourceQuotaResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The error code returned when an error occurs during the call. A normal result does not necessarily include this field. Do not use the return of a specific success code as a prerequisite for obtaining the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidProductType.ValueNotSupported</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The maximum resource count quota applicable to the current query conditions. This is not the usage or remaining quota.</p>
         * <ul>
         * <li><code>ResourceType=AppInstanceGroup</code>: Unit: groups.</li>
         * <li><code>ResourceType=AppAuthUser</code>: Unit: users.</li>
         * <li><code>ResourceType=PoolNodeAmount</code>: Unit: nodes.</li>
         * </ul>
         * <p>If no smaller limit is obtained, <code>2147483647</code> is returned. This does not mean that the resource inventory is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder data(Long data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when an error occurs during the call. This message and the error code help you locate the cause of the error.</p>
         * 
         * <strong>example:</strong>
         * <p>The ProductType is not supported.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceQuotaResponseBody build() {
            return new GetResourceQuotaResponseBody(this);
        } 

    } 

}

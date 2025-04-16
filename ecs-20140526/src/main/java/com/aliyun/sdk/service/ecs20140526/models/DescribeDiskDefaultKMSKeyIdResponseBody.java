// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeDiskDefaultKMSKeyIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskDefaultKMSKeyIdResponseBody</p>
 */
public class DescribeDiskDefaultKMSKeyIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KMSKeyId")
    private String KMSKeyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDiskDefaultKMSKeyIdResponseBody(Builder builder) {
        this.KMSKeyId = builder.KMSKeyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskDefaultKMSKeyIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String KMSKeyId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDiskDefaultKMSKeyIdResponseBody model) {
            this.KMSKeyId = model.KMSKeyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the KMS key.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiskDefaultKMSKeyIdResponseBody build() {
            return new DescribeDiskDefaultKMSKeyIdResponseBody(this);
        } 

    } 

}

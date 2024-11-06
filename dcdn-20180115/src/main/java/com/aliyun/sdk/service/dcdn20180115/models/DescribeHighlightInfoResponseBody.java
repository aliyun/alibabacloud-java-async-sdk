// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHighlightInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHighlightInfoResponseBody</p>
 */
public class DescribeHighlightInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataModule")
    private java.util.List < DataModule> dataModule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHighlightInfoResponseBody(Builder builder) {
        this.dataModule = builder.dataModule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHighlightInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataModule
     */
    public java.util.List < DataModule> getDataModule() {
        return this.dataModule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DataModule> dataModule; 
        private String requestId; 

        /**
         * <p>The data model of the highlighted data.</p>
         */
        public Builder dataModule(java.util.List < DataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHighlightInfoResponseBody build() {
            return new DescribeHighlightInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHighlightInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighlightInfoResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hit")
        private String hit;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Raw")
        private String raw;

        private DataModule(Builder builder) {
            this.hit = builder.hit;
            this.key = builder.key;
            this.raw = builder.raw;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return hit
         */
        public String getHit() {
            return this.hit;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return raw
         */
        public String getRaw() {
            return this.raw;
        }

        public static final class Builder {
            private String hit; 
            private String key; 
            private String raw; 

            /**
             * <p>The highlighted data.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;data:image/php;base64&quot;]</p>
             */
            public Builder hit(String hit) {
                this.hit = hit;
                return this;
            }

            /**
             * <p>The type of the highlighted data.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The complete data.</p>
             * 
             * <strong>example:</strong>
             * <p>data:image/php;base64,PD9waHAXXXXXXanVzdHR0dHXXXXXB0ZXN0Ijs/Pg==</p>
             */
            public Builder raw(String raw) {
                this.raw = raw;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHighlightInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHighlightInfoResponseBody</p>
 */
public class DescribeHighlightInfoResponseBody extends TeaModel {
    @NameInMap("DataModule")
    private java.util.List < DataModule> dataModule;

    @NameInMap("RequestId")
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
         * The model of the highlighted data.
         */
        public Builder dataModule(java.util.List < DataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHighlightInfoResponseBody build() {
            return new DescribeHighlightInfoResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("Hit")
        private String hit;

        @NameInMap("Key")
        private String key;

        @NameInMap("Raw")
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
             * The highlighted data.
             */
            public Builder hit(String hit) {
                this.hit = hit;
                return this;
            }

            /**
             * The type of the highlight data.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Complete data.
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

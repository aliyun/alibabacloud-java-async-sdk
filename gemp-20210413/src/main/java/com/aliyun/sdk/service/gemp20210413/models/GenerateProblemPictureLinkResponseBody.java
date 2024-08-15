// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateProblemPictureLinkResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateProblemPictureLinkResponseBody</p>
 */
public class GenerateProblemPictureLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GenerateProblemPictureLinkResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateProblemPictureLinkResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateProblemPictureLinkResponseBody build() {
            return new GenerateProblemPictureLinkResponseBody(this);
        } 

    } 

    public static class Links extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("link")
        private String link;

        private Links(Builder builder) {
            this.key = builder.key;
            this.link = builder.link;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Links create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        public static final class Builder {
            private String key; 
            private String link; 

            /**
             * oss key
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            public Links build() {
                return new Links(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("links")
        private java.util.List < Links> links;

        private Data(Builder builder) {
            this.links = builder.links;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return links
         */
        public java.util.List < Links> getLinks() {
            return this.links;
        }

        public static final class Builder {
            private java.util.List < Links> links; 

            /**
             * links.
             */
            public Builder links(java.util.List < Links> links) {
                this.links = links;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

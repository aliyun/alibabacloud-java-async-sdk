// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainMappingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainMappingResponseBody</p>
 */
public class DescribeLiveDomainMappingResponseBody extends TeaModel {
    @NameInMap("LiveDomainModels")
    private LiveDomainModels liveDomainModels;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDomainMappingResponseBody(Builder builder) {
        this.liveDomainModels = builder.liveDomainModels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainMappingResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveDomainModels
     */
    public LiveDomainModels getLiveDomainModels() {
        return this.liveDomainModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveDomainModels liveDomainModels; 
        private String requestId; 

        /**
         * LiveDomainModels.
         */
        public Builder liveDomainModels(LiveDomainModels liveDomainModels) {
            this.liveDomainModels = liveDomainModels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainMappingResponseBody build() {
            return new DescribeLiveDomainMappingResponseBody(this);
        } 

    } 

    public static class LiveDomainModel extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Type")
        private String type;

        private LiveDomainModel(Builder builder) {
            this.domainName = builder.domainName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveDomainModel create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String domainName; 
            private String type; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LiveDomainModel build() {
                return new LiveDomainModel(this);
            } 

        } 

    }
    public static class LiveDomainModels extends TeaModel {
        @NameInMap("LiveDomainModel")
        private java.util.List < LiveDomainModel> liveDomainModel;

        private LiveDomainModels(Builder builder) {
            this.liveDomainModel = builder.liveDomainModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveDomainModels create() {
            return builder().build();
        }

        /**
         * @return liveDomainModel
         */
        public java.util.List < LiveDomainModel> getLiveDomainModel() {
            return this.liveDomainModel;
        }

        public static final class Builder {
            private java.util.List < LiveDomainModel> liveDomainModel; 

            /**
             * LiveDomainModel.
             */
            public Builder liveDomainModel(java.util.List < LiveDomainModel> liveDomainModel) {
                this.liveDomainModel = liveDomainModel;
                return this;
            }

            public LiveDomainModels build() {
                return new LiveDomainModels(this);
            } 

        } 

    }
}

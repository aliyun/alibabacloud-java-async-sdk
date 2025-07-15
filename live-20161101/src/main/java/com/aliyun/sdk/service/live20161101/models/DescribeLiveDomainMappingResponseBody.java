// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDomainMappingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainMappingResponseBody</p>
 */
public class DescribeLiveDomainMappingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveDomainModels")
    private LiveDomainModels liveDomainModels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveDomainMappingResponseBody model) {
            this.liveDomainModels = model.liveDomainModels;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The mappings of the queried domain name.</p>
         */
        public Builder liveDomainModels(LiveDomainModels liveDomainModels) {
            this.liveDomainModels = liveDomainModels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F6CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainMappingResponseBody build() {
            return new DescribeLiveDomainMappingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainMappingResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainMappingResponseBody</p>
     */
    public static class LiveDomainModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(LiveDomainModel model) {
                this.domainName = model.domainName;
                this.type = model.type;
            } 

            /**
             * <p>The domain name to which the queried domain name is mapped.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The type of the queried domain name. Valid values:</p>
             * <ul>
             * <li><strong>vhost</strong>: main streaming domain</li>
             * <li><strong>publish</strong>: ingest domain</li>
             * <li><strong>play</strong>: sub-streaming domain</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>play</p>
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
    /**
     * 
     * {@link DescribeLiveDomainMappingResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainMappingResponseBody</p>
     */
    public static class LiveDomainModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveDomainModel")
        private java.util.List<LiveDomainModel> liveDomainModel;

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
        public java.util.List<LiveDomainModel> getLiveDomainModel() {
            return this.liveDomainModel;
        }

        public static final class Builder {
            private java.util.List<LiveDomainModel> liveDomainModel; 

            private Builder() {
            } 

            private Builder(LiveDomainModels model) {
                this.liveDomainModel = model.liveDomainModel;
            } 

            /**
             * LiveDomainModel.
             */
            public Builder liveDomainModel(java.util.List<LiveDomainModel> liveDomainModel) {
                this.liveDomainModel = liveDomainModel;
                return this;
            }

            public LiveDomainModels build() {
                return new LiveDomainModels(this);
            } 

        } 

    }
}

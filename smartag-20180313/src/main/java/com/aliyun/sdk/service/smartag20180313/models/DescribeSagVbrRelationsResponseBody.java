// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSagVbrRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagVbrRelationsResponseBody</p>
 */
public class DescribeSagVbrRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SagVbrRelations")
    private java.util.List<SagVbrRelations> sagVbrRelations;

    private DescribeSagVbrRelationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sagVbrRelations = builder.sagVbrRelations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagVbrRelationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sagVbrRelations
     */
    public java.util.List<SagVbrRelations> getSagVbrRelations() {
        return this.sagVbrRelations;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SagVbrRelations> sagVbrRelations; 

        private Builder() {
        } 

        private Builder(DescribeSagVbrRelationsResponseBody model) {
            this.requestId = model.requestId;
            this.sagVbrRelations = model.sagVbrRelations;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>17D79124-104A-42DB-8FCA-CE2957CD1723</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the specified VBR is associated with an SAG instance.</p>
         */
        public Builder sagVbrRelations(java.util.List<SagVbrRelations> sagVbrRelations) {
            this.sagVbrRelations = sagVbrRelations;
            return this;
        }

        public DescribeSagVbrRelationsResponseBody build() {
            return new DescribeSagVbrRelationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagVbrRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagVbrRelationsResponseBody</p>
     */
    public static class SagVbrRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SagInstanceId")
        private String sagInstanceId;

        @com.aliyun.core.annotation.NameInMap("SagUid")
        private String sagUid;

        @com.aliyun.core.annotation.NameInMap("VbrInstanceId")
        private String vbrInstanceId;

        private SagVbrRelations(Builder builder) {
            this.sagInstanceId = builder.sagInstanceId;
            this.sagUid = builder.sagUid;
            this.vbrInstanceId = builder.vbrInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SagVbrRelations create() {
            return builder().build();
        }

        /**
         * @return sagInstanceId
         */
        public String getSagInstanceId() {
            return this.sagInstanceId;
        }

        /**
         * @return sagUid
         */
        public String getSagUid() {
            return this.sagUid;
        }

        /**
         * @return vbrInstanceId
         */
        public String getVbrInstanceId() {
            return this.vbrInstanceId;
        }

        public static final class Builder {
            private String sagInstanceId; 
            private String sagUid; 
            private String vbrInstanceId; 

            private Builder() {
            } 

            private Builder(SagVbrRelations model) {
                this.sagInstanceId = model.sagInstanceId;
                this.sagUid = model.sagUid;
                this.vbrInstanceId = model.vbrInstanceId;
            } 

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-0nnteglltw6z4b****</p>
             */
            public Builder sagInstanceId(String sagInstanceId) {
                this.sagInstanceId = sagInstanceId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the SAG instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>16884015121212****</p>
             */
            public Builder sagUid(String sagUid) {
                this.sagUid = sagUid;
                return this;
            }

            /**
             * <p>The ID of the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-bp15ihkk93ezxppk****</p>
             */
            public Builder vbrInstanceId(String vbrInstanceId) {
                this.vbrInstanceId = vbrInstanceId;
                return this;
            }

            public SagVbrRelations build() {
                return new SagVbrRelations(this);
            } 

        } 

    }
}

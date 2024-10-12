// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateViewPointRequest} extends {@link RequestModel}
 *
 * <p>GenerateViewPointRequest</p>
 */
public class GenerateViewPointRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferenceData")
    private ReferenceData referenceData;

    private GenerateViewPointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.referenceData = builder.referenceData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateViewPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return referenceData
     */
    public ReferenceData getReferenceData() {
        return this.referenceData;
    }

    public static final class Builder extends Request.Builder<GenerateViewPointRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private ReferenceData referenceData; 

        private Builder() {
            super();
        } 

        private Builder(GenerateViewPointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.referenceData = request.referenceData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * ReferenceData.
         */
        public Builder referenceData(ReferenceData referenceData) {
            String referenceDataShrink = shrink(referenceData, "ReferenceData", "json");
            this.putBodyParameter("ReferenceData", referenceDataShrink);
            this.referenceData = referenceData;
            return this;
        }

        @Override
        public GenerateViewPointRequest build() {
            return new GenerateViewPointRequest(this);
        } 

    } 

    /**
     * 
     * {@link GenerateViewPointRequest} extends {@link TeaModel}
     *
     * <p>GenerateViewPointRequest</p>
     */
    public static class ReferenceData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MiniDoc")
        private java.util.List < String > miniDoc;

        private ReferenceData(Builder builder) {
            this.miniDoc = builder.miniDoc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferenceData create() {
            return builder().build();
        }

        /**
         * @return miniDoc
         */
        public java.util.List < String > getMiniDoc() {
            return this.miniDoc;
        }

        public static final class Builder {
            private java.util.List < String > miniDoc; 

            /**
             * MiniDoc.
             */
            public Builder miniDoc(java.util.List < String > miniDoc) {
                this.miniDoc = miniDoc;
                return this;
            }

            public ReferenceData build() {
                return new ReferenceData(this);
            } 

        } 

    }
}

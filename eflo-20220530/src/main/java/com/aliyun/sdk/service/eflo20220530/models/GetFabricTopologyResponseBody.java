// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetFabricTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>GetFabricTopologyResponseBody</p>
 */
public class GetFabricTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFabricTopologyResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFabricTopologyResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFabricTopologyResponseBody build() {
            return new GetFabricTopologyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFabricTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetFabricTopologyResponseBody</p>
     */
    public static class TopoInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LayerName")
        private String layerName;

        @com.aliyun.core.annotation.NameInMap("LayerType")
        private String layerType;

        @com.aliyun.core.annotation.NameInMap("NextLayer")
        private java.util.List<?> nextLayer;

        private TopoInfo(Builder builder) {
            this.layerName = builder.layerName;
            this.layerType = builder.layerType;
            this.nextLayer = builder.nextLayer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopoInfo create() {
            return builder().build();
        }

        /**
         * @return layerName
         */
        public String getLayerName() {
            return this.layerName;
        }

        /**
         * @return layerType
         */
        public String getLayerType() {
            return this.layerType;
        }

        /**
         * @return nextLayer
         */
        public java.util.List<?> getNextLayer() {
            return this.nextLayer;
        }

        public static final class Builder {
            private String layerName; 
            private String layerType; 
            private java.util.List<?> nextLayer; 

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>core-1</p>
             */
            public Builder layerName(String layerName) {
                this.layerName = layerName;
                return this;
            }

            /**
             * <p>Hierarchical resource types</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>core: core layer.</li>
             * <li>node: Lingjun node.</li>
             * <li>lni: lingjun network interface controller.</li>
             * <li>spine: backbone layer.</li>
             * <li>leaf: access layer</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>core</p>
             */
            public Builder layerType(String layerType) {
                this.layerType = layerType;
                return this;
            }

            /**
             * <p>Next Level</p>
             */
            public Builder nextLayer(java.util.List<?> nextLayer) {
                this.nextLayer = nextLayer;
                return this;
            }

            public TopoInfo build() {
                return new TopoInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFabricTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetFabricTopologyResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TopoInfo")
        private java.util.List<TopoInfo> topoInfo;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        private Content(Builder builder) {
            this.clusterId = builder.clusterId;
            this.regionId = builder.regionId;
            this.topoInfo = builder.topoInfo;
            this.vpcId = builder.vpcId;
            this.vpdId = builder.vpdId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return topoInfo
         */
        public java.util.List<TopoInfo> getTopoInfo() {
            return this.topoInfo;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private String clusterId; 
            private String regionId; 
            private java.util.List<TopoInfo> topoInfo; 
            private String vpcId; 
            private String vpdId; 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster-****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>network interface controller Topology Information</p>
             */
            public Builder topoInfo(java.util.List<TopoInfo> topoInfo) {
                this.topoInfo = topoInfo;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-j6ctp4n75306****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>Lingjun CIDR block ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-fuli****</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}

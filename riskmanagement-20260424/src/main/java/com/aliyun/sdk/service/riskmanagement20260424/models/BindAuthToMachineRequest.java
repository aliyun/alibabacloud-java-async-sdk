// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link BindAuthToMachineRequest} extends {@link RequestModel}
 *
 * <p>BindAuthToMachineRequest</p>
 */
public class BindAuthToMachineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkRequest")
    private SdkRequest sdkRequest;

    private BindAuthToMachineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sdkRequest = builder.sdkRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAuthToMachineRequest create() {
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
     * @return sdkRequest
     */
    public SdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static final class Builder extends Request.Builder<BindAuthToMachineRequest, Builder> {
        private String regionId; 
        private SdkRequest sdkRequest; 

        private Builder() {
            super();
        } 

        private Builder(BindAuthToMachineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sdkRequest = request.sdkRequest;
        } 

        /**
         * <p>The region ID of the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Security Center SDK request.</p>
         */
        public Builder sdkRequest(SdkRequest sdkRequest) {
            String sdkRequestShrink = shrink(sdkRequest, "SdkRequest", "json");
            this.putQueryParameter("SdkRequest", sdkRequestShrink);
            this.sdkRequest = sdkRequest;
            return this;
        }

        @Override
        public BindAuthToMachineRequest build() {
            return new BindAuthToMachineRequest(this);
        } 

    } 

    /**
     * 
     * {@link BindAuthToMachineRequest} extends {@link TeaModel}
     *
     * <p>BindAuthToMachineRequest</p>
     */
    public static class SdkRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthVersion")
        private Integer authVersion;

        @com.aliyun.core.annotation.NameInMap("AutoBind")
        private Integer autoBind;

        @com.aliyun.core.annotation.NameInMap("Bind")
        private java.util.List<String> bind;

        @com.aliyun.core.annotation.NameInMap("BindAll")
        private Boolean bindAll;

        @com.aliyun.core.annotation.NameInMap("Criteria")
        private String criteria;

        @com.aliyun.core.annotation.NameInMap("IsPreBind")
        private Integer isPreBind;

        @com.aliyun.core.annotation.NameInMap("LogicalExp")
        private String logicalExp;

        @com.aliyun.core.annotation.NameInMap("NtmVersion")
        private Long ntmVersion;

        @com.aliyun.core.annotation.NameInMap("PreBindOrderId")
        private Long preBindOrderId;

        @com.aliyun.core.annotation.NameInMap("UnBind")
        private java.util.List<String> unBind;

        private SdkRequest(Builder builder) {
            this.authVersion = builder.authVersion;
            this.autoBind = builder.autoBind;
            this.bind = builder.bind;
            this.bindAll = builder.bindAll;
            this.criteria = builder.criteria;
            this.isPreBind = builder.isPreBind;
            this.logicalExp = builder.logicalExp;
            this.ntmVersion = builder.ntmVersion;
            this.preBindOrderId = builder.preBindOrderId;
            this.unBind = builder.unBind;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkRequest create() {
            return builder().build();
        }

        /**
         * @return authVersion
         */
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        /**
         * @return autoBind
         */
        public Integer getAutoBind() {
            return this.autoBind;
        }

        /**
         * @return bind
         */
        public java.util.List<String> getBind() {
            return this.bind;
        }

        /**
         * @return bindAll
         */
        public Boolean getBindAll() {
            return this.bindAll;
        }

        /**
         * @return criteria
         */
        public String getCriteria() {
            return this.criteria;
        }

        /**
         * @return isPreBind
         */
        public Integer getIsPreBind() {
            return this.isPreBind;
        }

        /**
         * @return logicalExp
         */
        public String getLogicalExp() {
            return this.logicalExp;
        }

        /**
         * @return ntmVersion
         */
        public Long getNtmVersion() {
            return this.ntmVersion;
        }

        /**
         * @return preBindOrderId
         */
        public Long getPreBindOrderId() {
            return this.preBindOrderId;
        }

        /**
         * @return unBind
         */
        public java.util.List<String> getUnBind() {
            return this.unBind;
        }

        public static final class Builder {
            private Integer authVersion; 
            private Integer autoBind; 
            private java.util.List<String> bind; 
            private Boolean bindAll; 
            private String criteria; 
            private Integer isPreBind; 
            private String logicalExp; 
            private Long ntmVersion; 
            private Long preBindOrderId; 
            private java.util.List<String> unBind; 

            private Builder() {
            } 

            private Builder(SdkRequest model) {
                this.authVersion = model.authVersion;
                this.autoBind = model.autoBind;
                this.bind = model.bind;
                this.bindAll = model.bindAll;
                this.criteria = model.criteria;
                this.isPreBind = model.isPreBind;
                this.logicalExp = model.logicalExp;
                this.ntmVersion = model.ntmVersion;
                this.preBindOrderId = model.preBindOrderId;
                this.unBind = model.unBind;
            } 

            /**
             * <p>The authorization version of the asset. Valid values:</p>
             * <ul>
             * <li><strong>6</strong>: Anti-virus Edition</li>
             * <li><strong>5</strong>: Advanced Edition</li>
             * <li><strong>3</strong>: Enterprise Edition</li>
             * <li><strong>7</strong>: Ultimate Edition</li>
             * <li><strong>10</strong>: Value-added Service Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic binding. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoBind(Integer autoBind) {
                this.autoBind = autoBind;
                return this;
            }

            /**
             * <p>The collection of UUIDs to bind.</p>
             * <blockquote>
             * <p>Bind and UnBind cannot both be empty.
             * Maximum number of child entries: 1000.</p>
             * </blockquote>
             */
            public Builder bind(java.util.List<String> bind) {
                this.bind = bind;
                return this;
            }

            /**
             * <p>Specifies whether to bind all assets. Default value: <strong>false</strong>. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bindAll(Boolean bindAll) {
                this.bindAll = bindAll;
                return this;
            }

            /**
             * <p>The search conditions for assets. This parameter is in JSON format. Pay attention to the letter case when you specify this parameter.</p>
             * <blockquote>
             * <p>You can search for assets by instance ID, instance name, VPC ID, region, public IP address, and other conditions. You can call the DescribeCriteria operation to query the supported search conditions.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;name\&quot;:\&quot;clientStatus\&quot;,\&quot;value\&quot;:\&quot;online\&quot;},{\&quot;name\&quot;:\&quot;authVersion\&quot;,\&quot;value\&quot;:\&quot;1\&quot;}]</p>
             */
            public Builder criteria(String criteria) {
                this.criteria = criteria;
                return this;
            }

            /**
             * <p>Specifies whether this is a pre-binding operation. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * <blockquote>
             * <p>After pre-binding is enabled, the corresponding authorization quota is automatically bound to the specified servers after the purchase is completed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isPreBind(Integer isPreBind) {
                this.isPreBind = isPreBind;
                return this;
            }

            /**
             * <p>The logical relationship between multiple search conditions. Valid values:</p>
             * <ul>
             * <li><strong>OR</strong>: The search conditions are in an <strong>OR</strong> relationship.</li>
             * <li><strong>AND</strong>: The search conditions are in an <strong>AND</strong> relationship.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder logicalExp(String logicalExp) {
                this.logicalExp = logicalExp;
                return this;
            }

            /**
             * <p>The order version associated with the pre-binding. Valid values:</p>
             * <ul>
             * <li><strong>level7</strong>: Anti-virus Edition</li>
             * <li><strong>level3</strong>: Advanced Edition</li>
             * <li><strong>level2</strong>: Enterprise Edition</li>
             * <li><strong>level8</strong>: Ultimate Edition</li>
             * <li><strong>level10</strong>: value-added service only</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>level2</p>
             */
            public Builder ntmVersion(Long ntmVersion) {
                this.ntmVersion = ntmVersion;
                return this;
            }

            /**
             * <p>The order ID associated with the pre-binding.</p>
             * <blockquote>
             * <p>Note: This field is of the Long type. Precision loss may occur during the sequence/deserialization procedure. The value must not exceed 9007199254740991.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>263076506250432</p>
             */
            public Builder preBindOrderId(Long preBindOrderId) {
                this.preBindOrderId = preBindOrderId;
                return this;
            }

            /**
             * <p>The collection of UUIDs to unbind.</p>
             * <blockquote>
             * <p><strong>Bind</strong> and <strong>UnBind</strong> cannot both be empty.</p>
             * </blockquote>
             */
            public Builder unBind(java.util.List<String> unBind) {
                this.unBind = unBind;
                return this;
            }

            public SdkRequest build() {
                return new SdkRequest(this);
            } 

        } 

    }
}

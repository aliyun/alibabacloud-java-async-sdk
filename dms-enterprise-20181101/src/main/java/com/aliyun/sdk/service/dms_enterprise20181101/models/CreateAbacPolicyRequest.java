// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAbacPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateAbacPolicyRequest</p>
 */
public class CreateAbacPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbacPolicyContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String abacPolicyContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbacPolicyDesc")
    private String abacPolicyDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbacPolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String abacPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private CreateAbacPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.abacPolicyContent = builder.abacPolicyContent;
        this.abacPolicyDesc = builder.abacPolicyDesc;
        this.abacPolicyName = builder.abacPolicyName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAbacPolicyRequest create() {
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
     * @return abacPolicyContent
     */
    public String getAbacPolicyContent() {
        return this.abacPolicyContent;
    }

    /**
     * @return abacPolicyDesc
     */
    public String getAbacPolicyDesc() {
        return this.abacPolicyDesc;
    }

    /**
     * @return abacPolicyName
     */
    public String getAbacPolicyName() {
        return this.abacPolicyName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateAbacPolicyRequest, Builder> {
        private String regionId; 
        private String abacPolicyContent; 
        private String abacPolicyDesc; 
        private String abacPolicyName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateAbacPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.abacPolicyContent = request.abacPolicyContent;
            this.abacPolicyDesc = request.abacPolicyDesc;
            this.abacPolicyName = request.abacPolicyName;
            this.tid = request.tid;
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
         * <p>{
         *   &quot;Statement&quot;: [
         *     {
         *       &quot;Action&quot;: &quot;<em>&quot;,
         *       &quot;Effect&quot;: &quot;Allow&quot;,
         *       &quot;Resource&quot;: &quot;</em>&quot;,
         *       &quot;Condition&quot;: {
         *         &quot;StringEqualsIgnoreCase&quot;: {
         *           &quot;dms:DbType&quot;: [
         *             &quot;redis&quot;
         *           ]
         *         }
         *       }
         *     }
         *   ],
         *   &quot;Version&quot;: &quot;1&quot;
         * }</p>
         */
        public Builder abacPolicyContent(String abacPolicyContent) {
            this.putQueryParameter("AbacPolicyContent", abacPolicyContent);
            this.abacPolicyContent = abacPolicyContent;
            return this;
        }

        /**
         * AbacPolicyDesc.
         */
        public Builder abacPolicyDesc(String abacPolicyDesc) {
            this.putQueryParameter("AbacPolicyDesc", abacPolicyDesc);
            this.abacPolicyDesc = abacPolicyDesc;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy_test</p>
         */
        public Builder abacPolicyName(String abacPolicyName) {
            this.putQueryParameter("AbacPolicyName", abacPolicyName);
            this.abacPolicyName = abacPolicyName;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateAbacPolicyRequest build() {
            return new CreateAbacPolicyRequest(this);
        } 

    } 

}

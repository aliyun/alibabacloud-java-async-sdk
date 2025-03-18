// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeProcessTaskCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeProcessTaskCountRequest</p>
 */
public class DescribeProcessTaskCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityUuidList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> entityUuidList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    private DescribeProcessTaskCountRequest(Builder builder) {
        super(builder);
        this.entityUuidList = builder.entityUuidList;
        this.lang = builder.lang;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessTaskCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityUuidList
     */
    public java.util.List<String> getEntityUuidList() {
        return this.entityUuidList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<DescribeProcessTaskCountRequest, Builder> {
        private java.util.List<String> entityUuidList; 
        private String lang; 
        private Long roleFor; 
        private String roleType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProcessTaskCountRequest request) {
            super(request);
            this.entityUuidList = request.entityUuidList;
            this.lang = request.lang;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * <p>Collection of entity UUIDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder entityUuidList(java.util.List<String> entityUuidList) {
            this.putQueryParameter("EntityUuidList", entityUuidList);
            this.entityUuidList = entityUuidList;
            return this;
        }

        /**
         * <p>Language type for request and response messages. Values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>User ID for administrators to switch to other member&quot;s perspective.</p>
         * 
         * <strong>example:</strong>
         * <p>104739******259</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putQueryParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>View type.</p>
         * <ul>
         * <li><strong>0</strong>: Current Alibaba Cloud account view.</li>
         * <li><strong>1</strong>: View for all accounts under the enterprise.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public DescribeProcessTaskCountRequest build() {
            return new DescribeProcessTaskCountRequest(this);
        } 

    } 

}

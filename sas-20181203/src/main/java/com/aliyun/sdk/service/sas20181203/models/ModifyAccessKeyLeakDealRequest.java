// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyAccessKeyLeakDealRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccessKeyLeakDealRequest</p>
 */
public class ModifyAccessKeyLeakDealRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdList")
    private java.util.List<Long> idList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ModifyAccessKeyLeakDealRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.idList = builder.idList;
        this.remark = builder.remark;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccessKeyLeakDealRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return idList
     */
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyAccessKeyLeakDealRequest, Builder> {
        private Long id; 
        private java.util.List<Long> idList; 
        private String remark; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccessKeyLeakDealRequest request) {
            super(request);
            this.id = request.id;
            this.idList = request.idList;
            this.remark = request.remark;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the AccessKey pair leak.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeAccesskeyLeakList~~">DescribeAccesskeyLeakList</a> operation to query the ID. You must specify at least one of the Id and <strong>IdList</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The IDs of AccessKey pair leaks.</p>
         */
        public Builder idList(java.util.List<Long> idList) {
            this.putQueryParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * <p>The remarks that are added.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled.</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The method to handle the AccessKey pair leak. Valid values:</p>
         * <ul>
         * <li><strong>manual</strong>: manually handle</li>
         * <li><strong>disable</strong>: disable</li>
         * <li><strong>add-whitelist</strong>: add to the whitelist</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyAccessKeyLeakDealRequest build() {
            return new ModifyAccessKeyLeakDealRequest(this);
        } 

    } 

}

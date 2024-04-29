// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Long > idList;

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
    public java.util.List < Long > getIdList() {
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
        private java.util.List < Long > idList; 
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
         * The ID of the AccessKey pair leak.
         * <p>
         * 
         * > You can call the [DescribeAccesskeyLeakList](~~DescribeAccesskeyLeakList~~) operation to query the ID. You must specify at least one of the Id and **IdList** parameters.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The IDs of AccessKey pair leaks.
         */
        public Builder idList(java.util.List < Long > idList) {
            this.putQueryParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * The remarks that are added.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The method to handle the AccessKey pair leak. Valid values:
         * <p>
         * 
         * *   **manual**: manually handle
         * *   **disable**: disable
         * *   **add-whitelist**: add to the whitelist
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

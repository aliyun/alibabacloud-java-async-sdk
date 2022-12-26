// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccessKeyLeakDealRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccessKeyLeakDealRequest</p>
 */
public class ModifyAccessKeyLeakDealRequest extends Request {
    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("IdList")
    private java.util.List < Long > idList;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IdList.
         */
        public Builder idList(java.util.List < Long > idList) {
            this.putQueryParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Type.
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

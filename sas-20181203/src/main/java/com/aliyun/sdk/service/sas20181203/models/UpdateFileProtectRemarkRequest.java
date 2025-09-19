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
 * {@link UpdateFileProtectRemarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileProtectRemarkRequest</p>
 */
public class UpdateFileProtectRemarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private java.util.List<String> remark;

    private UpdateFileProtectRemarkRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileProtectRemarkRequest create() {
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
     * @return remark
     */
    public java.util.List<String> getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdateFileProtectRemarkRequest, Builder> {
        private Long id; 
        private java.util.List<String> remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileProtectRemarkRequest request) {
            super(request);
            this.id = request.id;
            this.remark = request.remark;
        } 

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1764</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The remarks.</p>
         */
        public Builder remark(java.util.List<String> remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateFileProtectRemarkRequest build() {
            return new UpdateFileProtectRemarkRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
 * {@link DeleteClientsRequest} extends {@link RequestModel}
 *
 * <p>DeleteClientsRequest</p>
 */
public class DeleteClientsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerAliUid")
    private String callerAliUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InManage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean inManage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> uuids;

    private DeleteClientsRequest(Builder builder) {
        super(builder);
        this.callerAliUid = builder.callerAliUid;
        this.inManage = builder.inManage;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClientsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callerAliUid
     */
    public String getCallerAliUid() {
        return this.callerAliUid;
    }

    /**
     * @return inManage
     */
    public Boolean getInManage() {
        return this.inManage;
    }

    /**
     * @return uuids
     */
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DeleteClientsRequest, Builder> {
        private String callerAliUid; 
        private Boolean inManage; 
        private java.util.List<String> uuids; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClientsRequest request) {
            super(request);
            this.callerAliUid = request.callerAliUid;
            this.inManage = request.inManage;
            this.uuids = request.uuids;
        } 

        /**
         * <p>aliuid</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder callerAliUid(String callerAliUid) {
            this.putQueryParameter("CallerAliUid", callerAliUid);
            this.callerAliUid = callerAliUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder inManage(Boolean inManage) {
            this.putBodyParameter("InManage", inManage);
            this.inManage = inManage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uuids(java.util.List<String> uuids) {
            this.putBodyParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DeleteClientsRequest build() {
            return new DeleteClientsRequest(this);
        } 

    } 

}

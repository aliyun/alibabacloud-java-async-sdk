// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAliasRequest} extends {@link RequestModel}
 *
 * <p>UpdateAliasRequest</p>
 */
public class UpdateAliasRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Alias")
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    private String serialNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private UpdateAliasRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.serialNo = builder.serialNo;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAliasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<UpdateAliasRequest, Builder> {
        private String alias; 
        private String serialNo; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAliasRequest request) {
            super(request);
            this.alias = request.alias;
            this.serialNo = request.serialNo;
            this.uuid = request.uuid;
        } 

        /**
         * Alias.
         */
        public Builder alias(String alias) {
            this.putBodyParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public UpdateAliasRequest build() {
            return new UpdateAliasRequest(this);
        } 

    } 

}

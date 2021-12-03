// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteAliasRequest} extends {@link RequestModel}
 *
 * <p>DeleteAliasRequest</p>
 */
public class DeleteAliasRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("aliasName")
    private String aliasName;

    @Header
    @NameInMap("If-Match")
    private String ifMatch;


    private DeleteAliasRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.aliasName = builder.aliasName;
        this.ifMatch = builder.ifMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAliasRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return ifMatch
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String aliasName; 
        private String ifMatch; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>别名</p>
         */
        public Builder aliasName(String aliasName) {
            this.putPathParameter("aliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>If-Match.</p>
         */
        public Builder ifMatch(String ifMatch) {
            this.putHeaderParameter("If-Match", ifMatch);
            this.ifMatch = ifMatch;
            return this;
        }

        public DeleteAliasRequest build() {
            return new DeleteAliasRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebLockDeleteConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebLockDeleteConfigRequest</p>
 */
public class ModifyWebLockDeleteConfigRequest extends Request {
    @Query
    @NameInMap("Id")
    private Integer id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private ModifyWebLockDeleteConfigRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebLockDeleteConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ModifyWebLockDeleteConfigRequest, Builder> {
        private Integer id; 
        private String lang; 
        private String sourceIp; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebLockDeleteConfigRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.uuid = request.uuid;
        } 

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ModifyWebLockDeleteConfigRequest build() {
            return new ModifyWebLockDeleteConfigRequest(this);
        } 

    } 

}

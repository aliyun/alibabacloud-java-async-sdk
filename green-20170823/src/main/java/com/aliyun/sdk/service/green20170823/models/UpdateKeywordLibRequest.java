// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKeywordLibRequest} extends {@link RequestModel}
 *
 * <p>UpdateKeywordLibRequest</p>
 */
public class UpdateKeywordLibRequest extends Request {
    @Query
    @NameInMap("BizTypes")
    private String bizTypes;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Integer id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MatchMode")
    private String matchMode;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private UpdateKeywordLibRequest(Builder builder) {
        super(builder);
        this.bizTypes = builder.bizTypes;
        this.enable = builder.enable;
        this.id = builder.id;
        this.lang = builder.lang;
        this.matchMode = builder.matchMode;
        this.name = builder.name;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKeywordLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTypes
     */
    public String getBizTypes() {
        return this.bizTypes;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
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
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<UpdateKeywordLibRequest, Builder> {
        private String bizTypes; 
        private Boolean enable; 
        private Integer id; 
        private String lang; 
        private String matchMode; 
        private String name; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKeywordLibRequest request) {
            super(request);
            this.bizTypes = request.bizTypes;
            this.enable = request.enable;
            this.id = request.id;
            this.lang = request.lang;
            this.matchMode = request.matchMode;
            this.name = request.name;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * BizTypes.
         */
        public Builder bizTypes(String bizTypes) {
            this.putQueryParameter("BizTypes", bizTypes);
            this.bizTypes = bizTypes;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
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
         * MatchMode.
         */
        public Builder matchMode(String matchMode) {
            this.putQueryParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        @Override
        public UpdateKeywordLibRequest build() {
            return new UpdateKeywordLibRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchVariableRequest} extends {@link RequestModel}
 *
 * <p>SwitchVariableRequest</p>
 */
public class SwitchVariableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataVersion")
    private Long dataVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private SwitchVariableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.dataVersion = builder.dataVersion;
        this.id = builder.id;
        this.name = builder.name;
        this.regId = builder.regId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchVariableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return dataVersion
     */
    public Long getDataVersion() {
        return this.dataVersion;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SwitchVariableRequest, Builder> {
        private String lang; 
        private Long dataVersion; 
        private Long id; 
        private String name; 
        private String regId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SwitchVariableRequest request) {
            super(request);
            this.lang = request.lang;
            this.dataVersion = request.dataVersion;
            this.id = request.id;
            this.name = request.name;
            this.regId = request.regId;
            this.status = request.status;
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
         * dataVersion.
         */
        public Builder dataVersion(Long dataVersion) {
            this.putQueryParameter("dataVersion", dataVersion);
            this.dataVersion = dataVersion;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public SwitchVariableRequest build() {
            return new SwitchVariableRequest(this);
        } 

    } 

}

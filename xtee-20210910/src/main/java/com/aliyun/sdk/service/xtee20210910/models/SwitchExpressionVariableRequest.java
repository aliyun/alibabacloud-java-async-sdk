// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchExpressionVariableRequest} extends {@link RequestModel}
 *
 * <p>SwitchExpressionVariableRequest</p>
 */
public class SwitchExpressionVariableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private SwitchExpressionVariableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.dataVersion = builder.dataVersion;
        this.id = builder.id;
        this.regId = builder.regId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchExpressionVariableRequest create() {
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

    public static final class Builder extends Request.Builder<SwitchExpressionVariableRequest, Builder> {
        private String lang; 
        private Long dataVersion; 
        private Long id; 
        private String regId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SwitchExpressionVariableRequest request) {
            super(request);
            this.lang = request.lang;
            this.dataVersion = request.dataVersion;
            this.id = request.id;
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
        public SwitchExpressionVariableRequest build() {
            return new SwitchExpressionVariableRequest(this);
        } 

    } 

}

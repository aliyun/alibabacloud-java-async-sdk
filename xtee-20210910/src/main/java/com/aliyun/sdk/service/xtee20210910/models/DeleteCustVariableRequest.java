// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustVariableRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustVariableRequest</p>
 */
public class DeleteCustVariableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataVersion")
    private Long dataVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("variableId")
    private String variableId;

    private DeleteCustVariableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.dataVersion = builder.dataVersion;
        this.regId = builder.regId;
        this.variableId = builder.variableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustVariableRequest create() {
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
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return dataVersion
     */
    public Long getDataVersion() {
        return this.dataVersion;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return variableId
     */
    public String getVariableId() {
        return this.variableId;
    }

    public static final class Builder extends Request.Builder<DeleteCustVariableRequest, Builder> {
        private String lang; 
        private String createType; 
        private Long dataVersion; 
        private String regId; 
        private String variableId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustVariableRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.dataVersion = request.dataVersion;
            this.regId = request.regId;
            this.variableId = request.variableId;
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
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * variableId.
         */
        public Builder variableId(String variableId) {
            this.putQueryParameter("variableId", variableId);
            this.variableId = variableId;
            return this;
        }

        @Override
        public DeleteCustVariableRequest build() {
            return new DeleteCustVariableRequest(this);
        } 

    } 

}

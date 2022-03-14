// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportRecordRequest} extends {@link RequestModel}
 *
 * <p>ExportRecordRequest</p>
 */
public class ExportRecordRequest extends Request {
    @Query
    @NameInMap("ExportType")
    @Validation(required = true)
    private String exportType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Params")
    private String params;

    private ExportRecordRequest(Builder builder) {
        super(builder);
        this.exportType = builder.exportType;
        this.lang = builder.lang;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportType
     */
    public String getExportType() {
        return this.exportType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<ExportRecordRequest, Builder> {
        private String exportType; 
        private String lang; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(ExportRecordRequest request) {
            super(request);
            this.exportType = request.exportType;
            this.lang = request.lang;
            this.params = request.params;
        } 

        /**
         * ExportType.
         */
        public Builder exportType(String exportType) {
            this.putQueryParameter("ExportType", exportType);
            this.exportType = exportType;
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
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        @Override
        public ExportRecordRequest build() {
            return new ExportRecordRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveAnalysisColumnRequest} extends {@link RequestModel}
 *
 * <p>SaveAnalysisColumnRequest</p>
 */
public class SaveAnalysisColumnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("columns")
    @com.aliyun.core.annotation.Validation(required = true)
    private String columns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    private SaveAnalysisColumnRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.columns = builder.columns;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAnalysisColumnRequest create() {
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
     * @return columns
     */
    public String getColumns() {
        return this.columns;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<SaveAnalysisColumnRequest, Builder> {
        private String lang; 
        private String columns; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(SaveAnalysisColumnRequest request) {
            super(request);
            this.lang = request.lang;
            this.columns = request.columns;
            this.regId = request.regId;
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
         * columns.
         */
        public Builder columns(String columns) {
            this.putQueryParameter("columns", columns);
            this.columns = columns;
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

        @Override
        public SaveAnalysisColumnRequest build() {
            return new SaveAnalysisColumnRequest(this);
        } 

    } 

}

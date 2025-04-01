// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetMmsDataSourceRequest} extends {@link RequestModel}
 *
 * <p>GetMmsDataSourceRequest</p>
 */
public class GetMmsDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withConfig")
    private Boolean withConfig;

    private GetMmsDataSourceRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.lang = builder.lang;
        this.withConfig = builder.withConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsDataSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return withConfig
     */
    public Boolean getWithConfig() {
        return this.withConfig;
    }

    public static final class Builder extends Request.Builder<GetMmsDataSourceRequest, Builder> {
        private Long sourceId; 
        private String lang; 
        private Boolean withConfig; 

        private Builder() {
            super();
        } 

        private Builder(GetMmsDataSourceRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.lang = request.lang;
            this.withConfig = request.withConfig;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * withConfig.
         */
        public Builder withConfig(Boolean withConfig) {
            this.putQueryParameter("withConfig", withConfig);
            this.withConfig = withConfig;
            return this;
        }

        @Override
        public GetMmsDataSourceRequest build() {
            return new GetMmsDataSourceRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountlabel20200315.models;

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
 * {@link BatchFetchAccountLabelRequest} extends {@link RequestModel}
 *
 * <p>BatchFetchAccountLabelRequest</p>
 */
public class BatchFetchAccountLabelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instant")
    private Boolean instant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelSeriesList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> labelSeriesList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Organization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private BatchFetchAccountLabelRequest(Builder builder) {
        super(builder);
        this.instant = builder.instant;
        this.labelSeriesList = builder.labelSeriesList;
        this.organization = builder.organization;
        this.pk = builder.pk;
        this.token = builder.token;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchFetchAccountLabelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instant
     */
    public Boolean getInstant() {
        return this.instant;
    }

    /**
     * @return labelSeriesList
     */
    public java.util.List<String> getLabelSeriesList() {
        return this.labelSeriesList;
    }

    /**
     * @return organization
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * @return pk
     */
    public Long getPk() {
        return this.pk;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<BatchFetchAccountLabelRequest, Builder> {
        private Boolean instant; 
        private java.util.List<String> labelSeriesList; 
        private String organization; 
        private Long pk; 
        private String token; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(BatchFetchAccountLabelRequest request) {
            super(request);
            this.instant = request.instant;
            this.labelSeriesList = request.labelSeriesList;
            this.organization = request.organization;
            this.pk = request.pk;
            this.token = request.token;
            this.userName = request.userName;
        } 

        /**
         * Instant.
         */
        public Builder instant(Boolean instant) {
            this.putQueryParameter("Instant", instant);
            this.instant = instant;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder labelSeriesList(java.util.List<String> labelSeriesList) {
            String labelSeriesListShrink = shrink(labelSeriesList, "LabelSeriesList", "simple");
            this.putQueryParameter("LabelSeriesList", labelSeriesListShrink);
            this.labelSeriesList = labelSeriesList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(Long pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public BatchFetchAccountLabelRequest build() {
            return new BatchFetchAccountLabelRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopListObjectProjectRequest} extends {@link RequestModel}
 *
 * <p>PopListObjectProjectRequest</p>
 */
public class PopListObjectProjectRequest extends Request {
    @Body
    @NameInMap("AuditStatus")
    private String auditStatus;

    @Body
    @NameInMap("Current")
    private Integer current;

    @Body
    @NameInMap("CustomSource")
    private String customSource;

    @Body
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("SortField")
    private String sortField;

    @Body
    @NameInMap("Status")
    private String status;

    @Body
    @NameInMap("Title")
    private String title;

    @Body
    @NameInMap("WithSource")
    private Boolean withSource;

    private PopListObjectProjectRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.current = builder.current;
        this.customSource = builder.customSource;
        this.jwtToken = builder.jwtToken;
        this.size = builder.size;
        this.sortField = builder.sortField;
        this.status = builder.status;
        this.title = builder.title;
        this.withSource = builder.withSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopListObjectProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditStatus
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return customSource
     */
    public String getCustomSource() {
        return this.customSource;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return withSource
     */
    public Boolean getWithSource() {
        return this.withSource;
    }

    public static final class Builder extends Request.Builder<PopListObjectProjectRequest, Builder> {
        private String auditStatus; 
        private Integer current; 
        private String customSource; 
        private String jwtToken; 
        private Integer size; 
        private String sortField; 
        private String status; 
        private String title; 
        private Boolean withSource; 

        private Builder() {
            super();
        } 

        private Builder(PopListObjectProjectRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.current = request.current;
            this.customSource = request.customSource;
            this.jwtToken = request.jwtToken;
            this.size = request.size;
            this.sortField = request.sortField;
            this.status = request.status;
            this.title = request.title;
            this.withSource = request.withSource;
        } 

        /**
         * AuditStatus.
         */
        public Builder auditStatus(String auditStatus) {
            this.putBodyParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * CustomSource.
         */
        public Builder customSource(String customSource) {
            this.putBodyParameter("CustomSource", customSource);
            this.customSource = customSource;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * WithSource.
         */
        public Builder withSource(Boolean withSource) {
            this.putBodyParameter("WithSource", withSource);
            this.withSource = withSource;
            return this;
        }

        @Override
        public PopListObjectProjectRequest build() {
            return new PopListObjectProjectRequest(this);
        } 

    } 

}

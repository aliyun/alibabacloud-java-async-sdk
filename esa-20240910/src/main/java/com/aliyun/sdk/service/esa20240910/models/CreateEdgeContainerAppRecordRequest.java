// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateEdgeContainerAppRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeContainerAppRecordRequest</p>
 */
public class CreateEdgeContainerAppRecordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 20)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecordName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024)
    private String recordName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private CreateEdgeContainerAppRecordRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.recordName = builder.recordName;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeContainerAppRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return recordName
     */
    public String getRecordName() {
        return this.recordName;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<CreateEdgeContainerAppRecordRequest, Builder> {
        private String appId; 
        private String recordName; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeContainerAppRecordRequest request) {
            super(request);
            this.appId = request.appId;
            this.recordName = request.recordName;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a.example.com</p>
         */
        public Builder recordName(String recordName) {
            this.putBodyParameter("RecordName", recordName);
            this.recordName = recordName;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public CreateEdgeContainerAppRecordRequest build() {
            return new CreateEdgeContainerAppRecordRequest(this);
        } 

    } 

}

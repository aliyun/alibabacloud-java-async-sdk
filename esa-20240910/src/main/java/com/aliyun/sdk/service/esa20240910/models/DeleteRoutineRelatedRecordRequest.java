// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRoutineRelatedRecordRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoutineRelatedRecordRequest</p>
 */
public class DeleteRoutineRelatedRecordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recordId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecordName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private DeleteRoutineRelatedRecordRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.recordId = builder.recordId;
        this.recordName = builder.recordName;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoutineRelatedRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
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

    public static final class Builder extends Request.Builder<DeleteRoutineRelatedRecordRequest, Builder> {
        private String name; 
        private Long recordId; 
        private String recordName; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoutineRelatedRecordRequest request) {
            super(request);
            this.name = request.name;
            this.recordId = request.recordId;
            this.recordName = request.recordName;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The routine name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DeleteRoutineRelatedRecord</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The record ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder recordId(Long recordId) {
            this.putBodyParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The record name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-xxx.example.com</p>
         */
        public Builder recordName(String recordName) {
            this.putBodyParameter("RecordName", recordName);
            this.recordName = recordName;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public DeleteRoutineRelatedRecordRequest build() {
            return new DeleteRoutineRelatedRecordRequest(this);
        } 

    } 

}

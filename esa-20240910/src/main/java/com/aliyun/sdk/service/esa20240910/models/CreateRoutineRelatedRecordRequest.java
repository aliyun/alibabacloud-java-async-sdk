// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateRoutineRelatedRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateRoutineRelatedRecordRequest</p>
 */
public class CreateRoutineRelatedRecordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecordName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private CreateRoutineRelatedRecordRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.recordName = builder.recordName;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineRelatedRecordRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRoutineRelatedRecordRequest, Builder> {
        private String name; 
        private String recordName; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoutineRelatedRecordRequest request) {
            super(request);
            this.name = request.name;
            this.recordName = request.recordName;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The routine name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateRoutineRelatedRecord</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The record name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-record-1.example.com</p>
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
         * <p>54362329990032</p>
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public CreateRoutineRelatedRecordRequest build() {
            return new CreateRoutineRelatedRecordRequest(this);
        } 

    } 

}

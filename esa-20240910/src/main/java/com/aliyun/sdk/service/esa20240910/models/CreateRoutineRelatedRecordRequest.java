// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecordName")
    private String recordName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
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
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RecordName.
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
        public CreateRoutineRelatedRecordRequest build() {
            return new CreateRoutineRelatedRecordRequest(this);
        } 

    } 

}

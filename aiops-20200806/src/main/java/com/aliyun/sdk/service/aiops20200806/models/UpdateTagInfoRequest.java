// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTagInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateTagInfoRequest</p>
 */
public class UpdateTagInfoRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("TagId")
    private Long tagId;

    @Query
    @NameInMap("TagName")
    private String tagName;

    private UpdateTagInfoRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.tagId = builder.tagId;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTagInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return tagId
     */
    public Long getTagId() {
        return this.tagId;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<UpdateTagInfoRequest, Builder> {
        private String operaUid; 
        private Long tagId; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTagInfoRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.tagId = request.tagId;
            this.tagName = request.tagName;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(Long tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public UpdateTagInfoRequest build() {
            return new UpdateTagInfoRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DeleteMediaConvertTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteMediaConvertTemplateGroupRequest</p>
 */
public class DeleteMediaConvertTemplateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceDelGroup")
    private String forceDelGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transcodeTemplateGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateIdList")
    private String transcodeTemplateIdList;

    private DeleteMediaConvertTemplateGroupRequest(Builder builder) {
        super(builder);
        this.forceDelGroup = builder.forceDelGroup;
        this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
        this.transcodeTemplateIdList = builder.transcodeTemplateIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaConvertTemplateGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceDelGroup
     */
    public String getForceDelGroup() {
        return this.forceDelGroup;
    }

    /**
     * @return transcodeTemplateGroupId
     */
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    /**
     * @return transcodeTemplateIdList
     */
    public String getTranscodeTemplateIdList() {
        return this.transcodeTemplateIdList;
    }

    public static final class Builder extends Request.Builder<DeleteMediaConvertTemplateGroupRequest, Builder> {
        private String forceDelGroup; 
        private String transcodeTemplateGroupId; 
        private String transcodeTemplateIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMediaConvertTemplateGroupRequest request) {
            super(request);
            this.forceDelGroup = request.forceDelGroup;
            this.transcodeTemplateGroupId = request.transcodeTemplateGroupId;
            this.transcodeTemplateIdList = request.transcodeTemplateIdList;
        } 

        /**
         * ForceDelGroup.
         */
        public Builder forceDelGroup(String forceDelGroup) {
            this.putQueryParameter("ForceDelGroup", forceDelGroup);
            this.forceDelGroup = forceDelGroup;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4c71a339fe52b4fa6f4527****</p>
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        /**
         * TranscodeTemplateIdList.
         */
        public Builder transcodeTemplateIdList(String transcodeTemplateIdList) {
            this.putQueryParameter("TranscodeTemplateIdList", transcodeTemplateIdList);
            this.transcodeTemplateIdList = transcodeTemplateIdList;
            return this;
        }

        @Override
        public DeleteMediaConvertTemplateGroupRequest build() {
            return new DeleteMediaConvertTemplateGroupRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link UpdateAssetScopeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAssetScopeRequest</p>
 */
public class UpdateAssetScopeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String matchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchTargetIds")
    private java.util.List<String> matchTargetIds;

    private UpdateAssetScopeRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.matchMode = builder.matchMode;
        this.matchTargetIds = builder.matchTargetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAssetScopeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return matchTargetIds
     */
    public java.util.List<String> getMatchTargetIds() {
        return this.matchTargetIds;
    }

    public static final class Builder extends Request.Builder<UpdateAssetScopeRequest, Builder> {
        private Long id; 
        private String matchMode; 
        private java.util.List<String> matchTargetIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAssetScopeRequest request) {
            super(request);
            this.id = request.id;
            this.matchMode = request.matchMode;
            this.matchTargetIds = request.matchTargetIds;
        } 

        /**
         * <p>The asset scope ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1932</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The effective scope mode. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: All user groups.</li>
         * <li><strong>UserGroupNormal</strong>: Specified user groups.</li>
         * <li><strong>DeviceGroupNormal</strong>: Specified device groups.</li>
         * <li><strong>DevTagNormal</strong>: Specified device tags.</li>
         * </ul>
         * <p>This field determines the meaning of MatchTargetIds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        public Builder matchMode(String matchMode) {
            this.putQueryParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The IDs of the user groups, device tags, or tag groups.</p>
         */
        public Builder matchTargetIds(java.util.List<String> matchTargetIds) {
            this.putQueryParameter("MatchTargetIds", matchTargetIds);
            this.matchTargetIds = matchTargetIds;
            return this;
        }

        @Override
        public UpdateAssetScopeRequest build() {
            return new UpdateAssetScopeRequest(this);
        } 

    } 

}

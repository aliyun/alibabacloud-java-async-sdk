// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ChangeVisibilityModelRequest} extends {@link RequestModel}
 *
 * <p>ChangeVisibilityModelRequest</p>
 */
public class ChangeVisibilityModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataPortalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataPortalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MenuIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String menuIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowOnlyWithAccess")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean showOnlyWithAccess;

    private ChangeVisibilityModelRequest(Builder builder) {
        super(builder);
        this.dataPortalId = builder.dataPortalId;
        this.menuIds = builder.menuIds;
        this.showOnlyWithAccess = builder.showOnlyWithAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeVisibilityModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataPortalId
     */
    public String getDataPortalId() {
        return this.dataPortalId;
    }

    /**
     * @return menuIds
     */
    public String getMenuIds() {
        return this.menuIds;
    }

    /**
     * @return showOnlyWithAccess
     */
    public Boolean getShowOnlyWithAccess() {
        return this.showOnlyWithAccess;
    }

    public static final class Builder extends Request.Builder<ChangeVisibilityModelRequest, Builder> {
        private String dataPortalId; 
        private String menuIds; 
        private Boolean showOnlyWithAccess; 

        private Builder() {
            super();
        } 

        private Builder(ChangeVisibilityModelRequest request) {
            super(request);
            this.dataPortalId = request.dataPortalId;
            this.menuIds = request.menuIds;
            this.showOnlyWithAccess = request.showOnlyWithAccess;
        } 

        /**
         * <p>The number of menus that are successfully modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0d173abb53e84c8ca7495429163b****</p>
         */
        public Builder dataPortalId(String dataPortalId) {
            this.putQueryParameter("DataPortalId", dataPortalId);
            this.dataPortalId = dataPortalId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>54kqgoa****,pg1n135****</p>
         */
        public Builder menuIds(String menuIds) {
            this.putQueryParameter("MenuIds", menuIds);
            this.menuIds = menuIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder showOnlyWithAccess(Boolean showOnlyWithAccess) {
            this.putQueryParameter("ShowOnlyWithAccess", showOnlyWithAccess);
            this.showOnlyWithAccess = showOnlyWithAccess;
            return this;
        }

        @Override
        public ChangeVisibilityModelRequest build() {
            return new ChangeVisibilityModelRequest(this);
        } 

    } 

}

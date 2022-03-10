// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeVisibilityModelRequest} extends {@link RequestModel}
 *
 * <p>ChangeVisibilityModelRequest</p>
 */
public class ChangeVisibilityModelRequest extends Request {
    @Query
    @NameInMap("DataPortalId")
    @Validation(required = true)
    private String dataPortalId;

    @Query
    @NameInMap("MenuIds")
    @Validation(required = true)
    private String menuIds;

    @Query
    @NameInMap("ShowOnlyWithAccess")
    @Validation(required = true)
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
         * DataPortalId.
         */
        public Builder dataPortalId(String dataPortalId) {
            this.putQueryParameter("DataPortalId", dataPortalId);
            this.dataPortalId = dataPortalId;
            return this;
        }

        /**
         * MenuIds.
         */
        public Builder menuIds(String menuIds) {
            this.putQueryParameter("MenuIds", menuIds);
            this.menuIds = menuIds;
            return this;
        }

        /**
         * ShowOnlyWithAccess.
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20220220.models;

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
 * {@link ListTerminalCommandsRequest} extends {@link RequestModel}
 *
 * <p>ListTerminalCommandsRequest</p>
 */
public class ListTerminalCommandsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalSessionToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String terminalSessionToken;

    private ListTerminalCommandsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.terminalSessionToken = builder.terminalSessionToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTerminalCommandsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return terminalSessionToken
     */
    public String getTerminalSessionToken() {
        return this.terminalSessionToken;
    }

    public static final class Builder extends Request.Builder<ListTerminalCommandsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String terminalSessionToken; 

        private Builder() {
            super();
        } 

        private Builder(ListTerminalCommandsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.terminalSessionToken = request.terminalSessionToken;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder terminalSessionToken(String terminalSessionToken) {
            this.putBodyParameter("TerminalSessionToken", terminalSessionToken);
            this.terminalSessionToken = terminalSessionToken;
            return this;
        }

        @Override
        public ListTerminalCommandsRequest build() {
            return new ListTerminalCommandsRequest(this);
        } 

    } 

}

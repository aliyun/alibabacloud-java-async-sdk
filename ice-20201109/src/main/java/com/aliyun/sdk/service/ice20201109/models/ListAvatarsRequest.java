// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAvatarsRequest} extends {@link RequestModel}
 *
 * <p>ListAvatarsRequest</p>
 */
public class ListAvatarsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvatarType")
    private String avatarType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    private ListAvatarsRequest(Builder builder) {
        super(builder);
        this.avatarType = builder.avatarType;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvatarsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatarType
     */
    public String getAvatarType() {
        return this.avatarType;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListAvatarsRequest, Builder> {
        private String avatarType; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListAvatarsRequest request) {
            super(request);
            this.avatarType = request.avatarType;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * <ul>
         * <li>The type of the digital human.</li>
         * <li>2DAvatar</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2DAvatar</p>
         */
        public Builder avatarType(String avatarType) {
            this.putQueryParameter("AvatarType", avatarType);
            this.avatarType = avatarType;
            return this;
        }

        /**
         * <ul>
         * <li>The page number.</li>
         * <li>Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <ul>
         * <li>The number of entries per page.</li>
         * <li>Default value: 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListAvatarsRequest build() {
            return new ListAvatarsRequest(this);
        } 

    } 

}

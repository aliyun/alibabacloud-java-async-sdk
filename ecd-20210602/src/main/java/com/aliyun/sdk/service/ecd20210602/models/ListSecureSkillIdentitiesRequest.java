// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link ListSecureSkillIdentitiesRequest} extends {@link RequestModel}
 *
 * <p>ListSecureSkillIdentitiesRequest</p>
 */
public class ListSecureSkillIdentitiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillChannel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillChannel;

    private ListSecureSkillIdentitiesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skillChannel = builder.skillChannel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecureSkillIdentitiesRequest create() {
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
     * @return skillChannel
     */
    public String getSkillChannel() {
        return this.skillChannel;
    }

    public static final class Builder extends Request.Builder<ListSecureSkillIdentitiesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skillChannel; 

        private Builder() {
            super();
        } 

        private Builder(ListSecureSkillIdentitiesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.skillChannel = request.skillChannel;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The skill channel. Valid values:</p>
         * <ul>
         * <li>ENTERPRISE: Enterprise edition.</li>
         * <li>BUSINESS: Business edition.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder skillChannel(String skillChannel) {
            this.putQueryParameter("SkillChannel", skillChannel);
            this.skillChannel = skillChannel;
            return this;
        }

        @Override
        public ListSecureSkillIdentitiesRequest build() {
            return new ListSecureSkillIdentitiesRequest(this);
        } 

    } 

}

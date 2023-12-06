// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentNodesRequest} extends {@link RequestModel}
 *
 * <p>ListEnvironmentNodesRequest</p>
 */
public class ListEnvironmentNodesRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Query
    @NameInMap("pageNum")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    private ListEnvironmentNodesRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListEnvironmentNodesRequest, Builder> {
        private String uid; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvironmentNodesRequest request) {
            super(request);
            this.uid = request.uid;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListEnvironmentNodesRequest build() {
            return new ListEnvironmentNodesRequest(this);
        } 

    } 

}

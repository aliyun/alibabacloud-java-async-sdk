// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link QueryRobotUnsubscriptionRequest} extends {@link RequestModel}
 *
 * <p>QueryRobotUnsubscriptionRequest</p>
 */
public class QueryRobotUnsubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RobotCode")
    private String robotCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    private QueryRobotUnsubscriptionRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.robotCode = builder.robotCode;
        this.sceneCode = builder.sceneCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRobotUnsubscriptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return robotCode
     */
    public String getRobotCode() {
        return this.robotCode;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    public static final class Builder extends Request.Builder<QueryRobotUnsubscriptionRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private String robotCode; 
        private String sceneCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryRobotUnsubscriptionRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.robotCode = request.robotCode;
            this.sceneCode = request.sceneCode;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * RobotCode.
         */
        public Builder robotCode(String robotCode) {
            this.putBodyParameter("RobotCode", robotCode);
            this.robotCode = robotCode;
            return this;
        }

        /**
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putBodyParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        @Override
        public QueryRobotUnsubscriptionRequest build() {
            return new QueryRobotUnsubscriptionRequest(this);
        } 

    } 

}

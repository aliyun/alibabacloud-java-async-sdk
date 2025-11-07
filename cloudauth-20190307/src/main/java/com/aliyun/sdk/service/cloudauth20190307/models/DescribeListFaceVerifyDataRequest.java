// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeListFaceVerifyDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeListFaceVerifyDataRequest</p>
 */
public class DescribeListFaceVerifyDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtEnd")
    private Long gmtEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtStart")
    private Long gmtStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    private DescribeListFaceVerifyDataRequest(Builder builder) {
        super(builder);
        this.gmtEnd = builder.gmtEnd;
        this.gmtStart = builder.gmtStart;
        this.name = builder.name;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListFaceVerifyDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtEnd
     */
    public Long getGmtEnd() {
        return this.gmtEnd;
    }

    /**
     * @return gmtStart
     */
    public Long getGmtStart() {
        return this.gmtStart;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<DescribeListFaceVerifyDataRequest, Builder> {
        private Long gmtEnd; 
        private Long gmtStart; 
        private String name; 
        private Long sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeListFaceVerifyDataRequest request) {
            super(request);
            this.gmtEnd = request.gmtEnd;
            this.gmtStart = request.gmtStart;
            this.name = request.name;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>End time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1760630399999</p>
         */
        public Builder gmtEnd(Long gmtEnd) {
            this.putQueryParameter("GmtEnd", gmtEnd);
            this.gmtEnd = gmtEnd;
            return this;
        }

        /**
         * <p>Start time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1760025600000</p>
         */
        public Builder gmtStart(Long gmtStart) {
            this.putQueryParameter("GmtStart", gmtStart);
            this.gmtStart = gmtStart;
            return this;
        }

        /**
         * <p>Product Code, currently deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Liveness</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000339</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public DescribeListFaceVerifyDataRequest build() {
            return new DescribeListFaceVerifyDataRequest(this);
        } 

    } 

}

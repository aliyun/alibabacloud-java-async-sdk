// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIMRobotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeIMRobotsRequest</p>
 */
public class DescribeIMRobotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RobotIds")
    private String robotIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RobotName")
    private String robotName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long size;

    private DescribeIMRobotsRequest(Builder builder) {
        super(builder);
        this.page = builder.page;
        this.robotIds = builder.robotIds;
        this.robotName = builder.robotName;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIMRobotsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return robotIds
     */
    public String getRobotIds() {
        return this.robotIds;
    }

    /**
     * @return robotName
     */
    public String getRobotName() {
        return this.robotName;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<DescribeIMRobotsRequest, Builder> {
        private Long page; 
        private String robotIds; 
        private String robotName; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIMRobotsRequest request) {
            super(request);
            this.page = request.page;
            this.robotIds = request.robotIds;
            this.robotName = request.robotName;
            this.size = request.size;
        } 

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The chatbot IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder robotIds(String robotIds) {
            this.putQueryParameter("RobotIds", robotIds);
            this.robotIds = robotIds;
            return this;
        }

        /**
         * <p>The name of the IM chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>Chatbot name</p>
         */
        public Builder robotName(String robotName) {
            this.putQueryParameter("RobotName", robotName);
            this.robotName = robotName;
            return this;
        }

        /**
         * <p>The number of IM chatbots to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public DescribeIMRobotsRequest build() {
            return new DescribeIMRobotsRequest(this);
        } 

    } 

}

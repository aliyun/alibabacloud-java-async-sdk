// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIMRobotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeIMRobotsRequest</p>
 */
public class DescribeIMRobotsRequest extends Request {
    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("RobotIds")
    private String robotIds;

    @Query
    @NameInMap("RobotName")
    private String robotName;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
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
         * The number of the page to return.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The chatbot IDs.
         */
        public Builder robotIds(String robotIds) {
            this.putQueryParameter("RobotIds", robotIds);
            this.robotIds = robotIds;
            return this;
        }

        /**
         * The name of the IM chatbot.
         */
        public Builder robotName(String robotName) {
            this.putQueryParameter("RobotName", robotName);
            this.robotName = robotName;
            return this;
        }

        /**
         * The number of IM chatbots to return on each page.
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

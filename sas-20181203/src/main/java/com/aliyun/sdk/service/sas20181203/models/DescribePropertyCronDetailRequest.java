// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribePropertyCronDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyCronDetailRequest</p>
 */
public class DescribePropertyCronDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribePropertyCronDetailRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.extend = builder.extend;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.source = builder.source;
        this.user = builder.user;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyCronDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribePropertyCronDetailRequest, Builder> {
        private Integer currentPage; 
        private String extend; 
        private Integer pageSize; 
        private String remark; 
        private String source; 
        private String user; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyCronDetailRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.extend = request.extend;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.source = request.source;
            this.user = request.user;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Specifies whether fuzzy search by path to the scheduled task is supported. If you want to use fuzzy search, set the parameter to <strong>1</strong>. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
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
         * <p>The name or IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The path to the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/cron.d/root</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The username of the account that runs the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribePropertyCronDetailRequest build() {
            return new DescribePropertyCronDetailRequest(this);
        } 

    } 

}

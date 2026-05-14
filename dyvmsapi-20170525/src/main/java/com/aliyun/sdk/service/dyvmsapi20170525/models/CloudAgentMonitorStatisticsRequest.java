// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudAgentMonitorStatisticsRequest} extends {@link RequestModel}
 *
 * <p>CloudAgentMonitorStatisticsRequest</p>
 */
public class CloudAgentMonitorStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cnos")
    private String cnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndHour")
    private Long endHour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fields")
    private String fields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gno")
    private String gno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsNeedQueueName")
    private String isNeedQueueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsUseGno")
    private Long isUseGno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartHour")
    private Long startHour;

    private CloudAgentMonitorStatisticsRequest(Builder builder) {
        super(builder);
        this.cnos = builder.cnos;
        this.endHour = builder.endHour;
        this.enterpriseId = builder.enterpriseId;
        this.fields = builder.fields;
        this.gno = builder.gno;
        this.isNeedQueueName = builder.isNeedQueueName;
        this.isUseGno = builder.isUseGno;
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.startHour = builder.startHour;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudAgentMonitorStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cnos
     */
    public String getCnos() {
        return this.cnos;
    }

    /**
     * @return endHour
     */
    public Long getEndHour() {
        return this.endHour;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return gno
     */
    public String getGno() {
        return this.gno;
    }

    /**
     * @return isNeedQueueName
     */
    public String getIsNeedQueueName() {
        return this.isNeedQueueName;
    }

    /**
     * @return isUseGno
     */
    public Long getIsUseGno() {
        return this.isUseGno;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return startHour
     */
    public Long getStartHour() {
        return this.startHour;
    }

    public static final class Builder extends Request.Builder<CloudAgentMonitorStatisticsRequest, Builder> {
        private String cnos; 
        private Long endHour; 
        private Long enterpriseId; 
        private String fields; 
        private String gno; 
        private String isNeedQueueName; 
        private Long isUseGno; 
        private Long limit; 
        private Long offset; 
        private Long startHour; 

        private Builder() {
            super();
        } 

        private Builder(CloudAgentMonitorStatisticsRequest request) {
            super(request);
            this.cnos = request.cnos;
            this.endHour = request.endHour;
            this.enterpriseId = request.enterpriseId;
            this.fields = request.fields;
            this.gno = request.gno;
            this.isNeedQueueName = request.isNeedQueueName;
            this.isUseGno = request.isUseGno;
            this.limit = request.limit;
            this.offset = request.offset;
            this.startHour = request.startHour;
        } 

        /**
         * <p>说明：根据座席工号查询指定座席的统计项名称支持按照多个座席工号进行查询，多个座席工号之间使用英文逗号&quot;,&quot;分隔，默认查询账户下所有座席的统计信息</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder cnos(String cnos) {
            this.putQueryParameter("Cnos", cnos);
            this.cnos = cnos;
            return this;
        }

        /**
         * <p>统计时间段；正整数，1～24，最大值是24时</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder endHour(Long endHour) {
            this.putQueryParameter("EndHour", endHour);
            this.endHour = endHour;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>统计项名称；取队列实时统计的统计字段名称，多个队列统计项之间使用英文逗号&quot;,&quot;分隔，默认查询所有统计项</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>说明：根据外呼组编号查询指定座席的统计项名称支持按照多个外呼组编号进行查询，多个座席工号之间使用英文逗号&quot;,&quot;分隔，默认查询账户下所有座席的统计信息</p>
         * 
         * <strong>example:</strong>
         * <p>WH123</p>
         */
        public Builder gno(String gno) {
            this.putQueryParameter("Gno", gno);
            this.gno = gno;
            return this;
        }

        /**
         * <p>是否需要返回队列名称；0：不需要（默认） 1：需要</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isNeedQueueName(String isNeedQueueName) {
            this.putQueryParameter("IsNeedQueueName", isNeedQueueName);
            this.isNeedQueueName = isNeedQueueName;
            return this;
        }

        /**
         * <p>是否需要外呼组查询；说明：0 关闭外呼组查询，1 开启外呼组查询。默认为关闭状态</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isUseGno(Long isUseGno) {
            this.putQueryParameter("IsUseGno", isUseGno);
            this.isUseGno = isUseGno;
            return this;
        }

        /**
         * <p>条数；正整数，默认值是10，最大值是500</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>查询页码数的起始条数；正整数，默认值是0；与limit同步使用，例：offset=50,limit=10,表示查询第6页，每页10条数据，即总记录的第51-60条数据</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>统计时间段；正整数，0～23，最大值是23时</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startHour(Long startHour) {
            this.putQueryParameter("StartHour", startHour);
            this.startHour = startHour;
            return this;
        }

        @Override
        public CloudAgentMonitorStatisticsRequest build() {
            return new CloudAgentMonitorStatisticsRequest(this);
        } 

    } 

}

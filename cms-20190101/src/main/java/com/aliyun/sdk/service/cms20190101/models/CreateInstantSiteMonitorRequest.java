// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateInstantSiteMonitorRequest} extends {@link RequestModel}
 *
 * <p>CreateInstantSiteMonitorRequest</p>
 */
public class CreateInstantSiteMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    @com.aliyun.core.annotation.Validation(required = true)
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspCities")
    private String ispCities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OptionsJson")
    private String optionsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RandomIspCity")
    private Integer randomIspCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private CreateInstantSiteMonitorRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.ispCities = builder.ispCities;
        this.optionsJson = builder.optionsJson;
        this.randomIspCity = builder.randomIspCity;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstantSiteMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return ispCities
     */
    public String getIspCities() {
        return this.ispCities;
    }

    /**
     * @return optionsJson
     */
    public String getOptionsJson() {
        return this.optionsJson;
    }

    /**
     * @return randomIspCity
     */
    public Integer getRandomIspCity() {
        return this.randomIspCity;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateInstantSiteMonitorRequest, Builder> {
        private String address; 
        private String ispCities; 
        private String optionsJson; 
        private Integer randomIspCity; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstantSiteMonitorRequest request) {
            super(request);
            this.address = request.address;
            this.ispCities = request.ispCities;
            this.optionsJson = request.optionsJson;
            this.randomIspCity = request.randomIspCity;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The URL or IP address that you want to test.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>The detection points. If you leave this parameter empty, the system randomly selects three detection points.</p>
         * <p>The value is a <code>JSON array</code>. Example: {&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}. The values of the city field indicate Beijing, Hangzhou, and Qingdao.</p>
         * <p>For information about how to obtain detection points, see <a href="https://help.aliyun.com/document_detail/115045.html">DescribeSiteMonitorISPCityList</a>.</p>
         * <blockquote>
         * <p>You must specify one of the <code>IspCities</code> and <code>RandomIspCity</code> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</p>
         */
        public Builder ispCities(String ispCities) {
            this.putQueryParameter("IspCities", ispCities);
            this.ispCities = ispCities;
            return this;
        }

        /**
         * <p>The extended options of the protocol that is used by the instant test task. The options vary based on the protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;time_out&quot;:5000}</p>
         */
        public Builder optionsJson(String optionsJson) {
            this.putQueryParameter("OptionsJson", optionsJson);
            this.optionsJson = optionsJson;
            return this;
        }

        /**
         * <p>The number of detection points.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>You must specify one of the <code>IspCities</code> and <code>RandomIspCity</code> parameters. If you specify the <code>RandomIspCity</code> parameter, the <code>IspCities</code> parameter automatically becomes invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder randomIspCity(Integer randomIspCity) {
            this.putQueryParameter("RandomIspCity", randomIspCity);
            this.randomIspCity = randomIspCity;
            return this;
        }

        /**
         * <p>The name of the instant test task.</p>
         * <p>The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (_).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task1</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The type of the instant test task. Valid values: HTTP, PING, TCP, UDP, and DNS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateInstantSiteMonitorRequest build() {
            return new CreateInstantSiteMonitorRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetClusterDiagnosisResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterDiagnosisResultResponseBody</p>
 */
public class GetClusterDiagnosisResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("created")
    private String created;

    @com.aliyun.core.annotation.NameInMap("diagnosis_id")
    private String diagnosisId;

    @com.aliyun.core.annotation.NameInMap("finished")
    private String finished;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("status")
    private Long status;

    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GetClusterDiagnosisResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.created = builder.created;
        this.diagnosisId = builder.diagnosisId;
        this.finished = builder.finished;
        this.message = builder.message;
        this.result = builder.result;
        this.status = builder.status;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterDiagnosisResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return created
     */
    public String getCreated() {
        return this.created;
    }

    /**
     * @return diagnosisId
     */
    public String getDiagnosisId() {
        return this.diagnosisId;
    }

    /**
     * @return finished
     */
    public String getFinished() {
        return this.finished;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long code; 
        private String created; 
        private String diagnosisId; 
        private String finished; 
        private String message; 
        private String result; 
        private Long status; 
        private String target; 
        private String type; 

        /**
         * <p>The code that indicates the diagnostic result. Valid values:</p>
         * <ul>
         * <li>0: the diagnostic is completed.</li>
         * <li>1: the diagnostic failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The time when the diagnostic is initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-28T11:29Z</p>
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * <p>The diagnostic ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6cf6b62e334e4583bdfd26707516****</p>
         */
        public Builder diagnosisId(String diagnosisId) {
            this.diagnosisId = diagnosisId;
            return this;
        }

        /**
         * <p>The time when the diagnostic is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-28T11:29Z</p>
         */
        public Builder finished(String finished) {
            this.finished = finished;
            return this;
        }

        /**
         * <p>The diagnostic status information.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The diagnostic result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;phase&quot;:5,&quot;version&quot;:&quot;20240101&quot;}</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The status of the diagnostic. Valid values:</p>
         * <ul>
         * <li>0: The diagnostic is created.</li>
         * <li>1: The diagnostic is running.</li>
         * <li>2: The diagnostic is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The diagnostic object.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;cn-hongkong.10.0.0.246&quot;}</p>
         */
        public Builder target(String target) {
            this.target = target;
            return this;
        }

        /**
         * <p>The type of the diagnostic.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>node</li>
         * <li>ingress</li>
         * <li>cluster</li>
         * <li>memory</li>
         * <li>pod</li>
         * <li>service</li>
         * <li>network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Node</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetClusterDiagnosisResultResponseBody build() {
            return new GetClusterDiagnosisResultResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.qweneduaisuite20261102.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation activates the Qwen learning AI suite capability for the current Alibaba Cloud account.</li>
     * <li>You must call this operation first. You can call business API operations such as problem solving and grading only after <code>ACTIVE</code> is returned.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Both Alibaba Cloud accounts and RAM users can call this operation.</li>
     * <li>When a RAM user calls this operation, ensure that the RAM user has the required RAM permissions. The service is activated for the Alibaba Cloud account to which the RAM user belongs.</li>
     * <li>This operation is idempotent based on the Alibaba Cloud account ID. Repeated calls do not result in multiple activations.</li>
     * </ul>
     * 
     * @param request the request parameters of ActivateQwenEduApi  ActivateQwenEduApiRequest
     * @return ActivateQwenEduApiResponse
     */
    CompletableFuture<ActivateQwenEduApiResponse> activateQwenEduApi(ActivateQwenEduApiRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation submits a homework image to the server for question segmentation, recognition, and grading.</li>
     * <li>You can submit the image by using <code>imageBase64</code> or <code>imageUrl</code>. <code>imageBase64</code> takes precedence.</li>
     * <li>The optional <code>dewarp</code> parameter specifies whether to correct the image distortion. Default value: <code>true</code>.</li>
     * <li>Provide <code>requestId</code> to facilitate troubleshooting and reconciliation.</li>
     * <li>Image size limit: The Base64-encoded image size cannot exceed 15 MB.</li>
     * <li>All requests and responses use the JSON format.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateEduHomeworkCorrectSubmit  CreateEduHomeworkCorrectSubmitRequest
     * @return CreateEduHomeworkCorrectSubmitResponse
     */
    CompletableFuture<CreateEduHomeworkCorrectSubmitResponse> createEduHomeworkCorrectSubmit(CreateEduHomeworkCorrectSubmitRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API supports obtaining question resolution results by providing the URL or Base64 encoding of a question image.</li>
     * <li>Supports processing a single image. The image format must be JPG, JPEG, or PNG.</li>
     * <li>The image must be clear and complete. Avoid tilted, obscured, or irrelevant content.</li>
     * <li>Each request can process only one image. Multi-image or plain text requests are not supported.</li>
     * <li>The recommended image size is up to 1 MB, with a maximum of 10 MB. The image width and height must not exceed 8,000 pixels, and the total pixel count must not exceed 2.6 million.</li>
     * <li>You must use the HTTPS protocol to call the API and provide image URLs.</li>
     * <li>The user_id parameter must be an anonymized identifier. Do not pass direct identity information such as names or phone numbers.</li>
     * <li>The API uses the HTTP POST method combined with Server-Sent Events (SSE) streaming response. The client must read the response event by event, rather than waiting for the connection to close to read the entire response.</li>
     * <li>A successful response returns the question resolution process through a series of message events and ends with a complete event. If an error occurs, an error event is returned.</li>
     * <li>For retryable errors such as TOO_MANY_ACTIVE_STREAMS, use an exponential backoff strategy to retry the request.</li>
     * <li>Set a reasonable timeout period of at least 3 minutes on the client, and ensure that the proxy layer does not cache SSE responses.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateEduProblemSolve  CreateEduProblemSolveRequest
     * @return CreateEduProblemSolveResponse
     */
    CompletableFuture<CreateEduProblemSolveResponse> createEduProblemSolve(CreateEduProblemSolveRequest request);

    ResponseIterable<CreateEduProblemSolveResponseBody> createEduProblemSolveWithResponseIterable(CreateEduProblemSolveRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the status and detailed results of single-page homework grading by using the <code>taskId</code> returned when the task is submitted.</li>
     * <li>The caller should poll this operation at an interval of 1 to 2 seconds until the task status changes to <code>finished</code> or <code>failed</code>.</li>
     * <li>When the task status is <code>finished</code>, the response contains complete grading information, including question recognition, grading conclusions, dewarped images, and rendered images.</li>
     * <li>If the task fails (the status is <code>failed</code>), check the <code>message</code> field in the response or the specific fault information in <code>data</code>.</li>
     * <li>All requests and responses are in JSON format.</li>
     * </ul>
     * 
     * @param request the request parameters of GetEduHomeworkCorrectionResult  GetEduHomeworkCorrectionResultRequest
     * @return GetEduHomeworkCorrectionResultResponse
     */
    CompletableFuture<GetEduHomeworkCorrectionResultResponse> getEduHomeworkCorrectionResult(GetEduHomeworkCorrectionResultRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation queries whether a specified Alibaba Cloud account or RAM user has successfully activated the Qwen learning AI suite. Before calling any business API operations, you must use this operation to confirm that the service status is <code>ACTIVE</code>. If the service is not activated, perform the corresponding operations based on the returned status information, such as waiting for a period of time and retrying.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>This operation supports calls from Alibaba Cloud accounts and RAM users.</li>
     * <li>When a RAM user calls this operation, make sure that the RAM user has the required RAM permissions. The service is activated for the Alibaba Cloud account to which the RAM user belongs.</li>
     * <li>This operation is idempotent based on the Alibaba Cloud account ID. Repeated calls do not result in multiple activations.</li>
     * <li>If the status is <code>ACTIVATING</code>, retry the query after the time interval recommended by the returned <code>retry_after_seconds</code> field.</li>
     * <li>If a failure occurs (<code>FAILED</code>), refer to the specific error code, take corresponding measures, and then try again.</li>
     * </ul>
     * 
     * @param request the request parameters of GetQwenEduApiActivationStatus  GetQwenEduApiActivationStatusRequest
     * @return GetQwenEduApiActivationStatusResponse
     */
    CompletableFuture<GetQwenEduApiActivationStatusResponse> getQwenEduApiActivationStatus(GetQwenEduApiActivationStatusRequest request);

}
